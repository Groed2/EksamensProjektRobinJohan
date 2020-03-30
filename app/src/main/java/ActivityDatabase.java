import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Activity.class, Day.class, Weight.class, oneTimeThings.class}, version = 1, exportSchema = false)
public abstract class ActivityDatabase extends RoomDatabase {

    public abstract DatabaseDAO DAO();

    private static volatile ActivityDatabase INSTANCE;
    private static final int Number_of_threads = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(Number_of_threads);

    static  ActivityDatabase getDatabase (final Context context)
    {
        if(INSTANCE == null)
        {
            synchronized (ActivityDatabase.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ActivityDatabase.class, "Activity_Database").build();

                }
            }

        }
        return INSTANCE;
    }



}
