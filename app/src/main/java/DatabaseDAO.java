import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DatabaseDAO
{
    //Insertion queries af de forskellige tabeller
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void InsertWeight(Weight weight);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void InsertActivity(Activity activity);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertOTT(oneTimeThings oneTimeThing);

    @Insert(onConflict =  OnConflictStrategy.IGNORE)
    public void insertDay(Day day);

    //Deletion queries af de forskellige tabeller
    @Delete
    public void deleteDay(Day day);

    @Delete
    public void deleteOTT(oneTimeThings oneTimeThing);

    @Delete
    public void DeleteActivity(Activity activity);

    @Delete
    public void DeleteWeight(Weight weight);

    // Opdateringer af de forskellige tabeller
    @Update
    public void UpdateWeight(Weight weight);

    @Update
    public void UpdateActivity(Activity activity);

    @Update
    public void updateOTT(oneTimeThings onTimeThing);

    @Update
    public void updateDay(Day day);

    @Query("SELECT * FROM day_table ORDER BY dayId ASC")
    List<Day> getAlphabetizedDays();

    @Query("SELECT * FROM weight_table ORDER BY mWeightId ASC")
    List<Weight> getAlphabetizedWeight();

    @Query("SELECT * FROM activity ORDER BY mActivityId ASC")
    List<Activity> getAlphabetizedActivities();

    @Query("SELECT * FROM ONETIME_TABLE ORDER BY oneTimeID ASC")
    List<oneTimeThings> getAlphabetizedThings();







}
