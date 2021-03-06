package mx.itesm.sqliteexample;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;

public class DataManager
{
    DBHelper myDBHelper;
    Context context;

    public DataManager(Context context)
    {
        this.context = context;
        this.myDBHelper = new DBHelper(context);
    }

    public boolean initialPopulate()
    {
        Log.i("INFO","LENGTH" + myDBHelper.numRowsUsers());
        if(myDBHelper.numRowsUsers()==0)
        {
            Log.e(null,"No data in database, I will populate");
            //Maybe first time user uses the App. Here we populate the database with some initial
            // data
            User user1 = new User("Eduardo","Méndez","02-09-1998","Master",8,"Edu","eduardo");
            User user2 = new User("Luis","Garcia","10-05-1998","Operator",8,"Luigi","luis");
            User user3 = new User("Mariana","Casanova","19-06-1997","Analyst",8,"Mar","mariana");
            User user4 = new User("Andrés","Aguirre","21-03-1998","Chief",8,"Edu","eduardo");
            myDBHelper.insertUser(user1);
            myDBHelper.insertUser(user2);
            myDBHelper.insertUser(user3);
            myDBHelper.insertUser(user4);
            return true;
        }
       else
           return false;
    }

    public ArrayList<User> getUsersToDisplay()
    {
        ArrayList<User> users_list = myDBHelper.getAllUsers();
        Log.e(null,"I obtained user list");
        if(users_list.isEmpty())
            Log.e(null,"LIST IS EMPTY. From getUsersToDisplay()");
        else
            Log.e(null,"LIST IS NOT EMPTY. From getUsersToDisplay()");

        return users_list;
    }

    public void insertUser(String name, String lastname, String dob, String role, Integer semester, String nickname, String password)
    {
        User user_toInsert = new User(name, lastname, dob, role, semester, nickname, password);
        myDBHelper.insertUser(user_toInsert);
    }
    public void insertProduct(String name, double price)
    {
        Product product_toInsert = new Product(name, price);
        myDBHelper.insertProduct(product_toInsert);
    }
}
