public class Local {

    public static void setData(String nameContainer, Context context, String name, String value) {
        SharedPreferences prefs = context.getSharedPreferences(nameContainer, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putString(name, value);

        editor.commit();
    }

    public static String getData(String nameContainer, Context context, String name) {
        SharedPreferences prefs = context.getSharedPreferences(nameContainer, Context.MODE_PRIVATE);
        return prefs.getString(name,"");
    }
}
