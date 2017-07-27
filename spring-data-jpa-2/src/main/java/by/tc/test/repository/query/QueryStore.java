package by.tc.test.repository.query;

public final class QueryStore {

    private QueryStore() {
    }

    public final static String ORDER_RECIPE_INSERT = "insert into order_recipe VALUES (:orderId, :recipeCode)";
}