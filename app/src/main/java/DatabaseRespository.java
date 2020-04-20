import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class DatabaseRespository {

    private DatabaseDAO mdbDAO;
    private LiveData<List<Activity>> mAllActivities;
    private LiveData<List<Day>> mAllDays;
    private LiveData<List<Weight>> mAllWeight;
    private LiveData<List<oneTimeThings>> mAllOTT;

    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples
    DatabaseRespository(Application application)
    {
        ActivityDatabase db = ActivityDatabase.getDatabase(application);
        mdbDAO = db.DAO();
        mAllActivities = mdbDAO.getAlphabetizedActivities();
        mAllDays = mdbDAO.getAlphabetizedDays();
        mAllWeight = mdbDAO.getAlphabetizedWeight();
        mAllOTT = mdbDAO.getAlphabetizedThings();
    }
    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Activity>> getAllActivities(){
        return mAllActivities;
    }
    LiveData<List<Day>> getAllDays()
    {
        return mAllDays;
    }
    LiveData<List<Weight>> getAllWeight()
    {
        return mAllWeight;
    }
    LiveData<List<oneTimeThings>> getAllOneTimeThings() {
        return mAllOTT;
    }
    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(final Activity activity)
    {
        ActivityDatabase.databaseWriteExecutor.execute(() -> mdbDAO.InsertActivity(activity));
    }
    void insert(final Day day)
    {
        ActivityDatabase.databaseWriteExecutor.execute(() ->
                mdbDAO.insertDay(day));
    }
    void insert(final Weight weight)
    {
        ActivityDatabase.databaseWriteExecutor.execute(() ->
                mdbDAO.InsertWeight(weight));
    }
    void insert(final oneTimeThings OTT)
    {
        ActivityDatabase.databaseWriteExecutor.execute(() ->
                mdbDAO.insertOTT(OTT));
    }



}
