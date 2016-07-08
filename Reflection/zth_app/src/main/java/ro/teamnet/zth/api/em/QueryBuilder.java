package ro.teamnet.zth.api.em;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by user on 7/8/2016.
 */
public class QueryBuilder {

    private Object tableName;
    private List<ColumnInfo> queryColumns;
    private QueryType queryType;
    private List<Condition> conditions;

    public String getValueForQuery(Object value){
        if(value instanceof String)
            return "'" + value + "'";
        else {
            DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
            return "TO_DATE('" + dateFormat.format((Date) value) + "','mm-dd-YYYY'";
        }
    }

    public QueryBuilder addCondition(Condition condition){
        if(conditions == null)
            conditions =new ArrayList<Condition>();
        conditions.add(condition);
        return this;
    }

    public QueryBuilder setTableName(Object tableName){
        this.tableName = tableName;
        return this;
    }

    public QueryBuilder addQueryColumns(List<ColumnInfo> queryColumns){
        if(queryColumns == null)
            queryColumns =new ArrayList<ColumnInfo>();
        queryColumns.addAll(queryColumns);
        return this;
    }

    public QueryBuilder setQueryType(QueryType queryType){
        this.queryType = queryType;
        return this;
    }

    private String createSelectQuery(){
        StringBuffer sb =  new StringBuffer();
        sb.append("SELECT ");
        boolean isFirst = true;
        for(ColumnInfo ci : queryColumns){
            if(!isFirst){
                sb.append(", ");
            }
            sb.append(ci.getDbName());
            isFirst = false;
        }

        isFirst = true;
        sb.append("FROM" + tableName + " WHERE ");
        for(Condition c : conditions) {
            if(!isFirst){
                sb.append(" AND ");
            }
            sb.append(c.getColumnName());
            sb.append("=");
            sb.append(c.getValue());
            isFirst = false;
        }
        return sb.toString();
    }

    private String createDeleteQuery(){
        StringBuffer sb =  new StringBuffer();
        boolean isFirst = true;
        sb.append(" DELETE FROM " + tableName + " WHERE ");
        for(Condition c : conditions) {
            if(!isFirst){
                sb.append(" AND ");
            }
            sb.append(c.getColumnName());
            sb.append("=");
            sb.append(c.getValue());
            isFirst = false;
        }
        return sb.toString();
    }

    private String createUpdateQuery(){
        StringBuffer sb =  new StringBuffer();
        boolean isFirst = true;
        sb.append("UPDATE " + tableName + " SET ");
        for(ColumnInfo ci : queryColumns){
            if(!isFirst){
                sb.append(", ");
            }
            sb.append(ci.getDbName());
            isFirst = false;
        }

        isFirst = true;
        sb.append(" WHERE ");
        for(Condition c : conditions) {
            if(!isFirst){
                sb.append(" AND ");
            }
            sb.append(c.getColumnName());
            sb.append("=");
            sb.append(c.getValue());
            isFirst = false;
        }
        return sb.toString();
    }

    private String createInsertQuery(){
        StringBuffer sb =  new StringBuffer();
        boolean isFirst = true;
        sb.append("INSERT INTO " + tableName + " VALUES( ");
        for(ColumnInfo ci : queryColumns){
            if(!isFirst){
                sb.append(", ");
            }
            sb.append(ci.getDbName());
            isFirst = false;
        }
        sb.append(");");
        return sb.toString();
    }

    public String createQuery(){
        String command = null;
        if(queryType == queryType.SELECT)
            command = createSelectQuery();
        if(queryType == queryType.DELETE)
            command = createDeleteQuery();
        if(queryType == queryType.INSERT)
            command = createInsertQuery();
        if(queryType == queryType.UPDATE)
            command = createUpdateQuery();
        return command;
    }
}
