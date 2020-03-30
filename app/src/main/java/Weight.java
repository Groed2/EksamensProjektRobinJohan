import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Weight_table")
public class Weight {
    @PrimaryKey(autoGenerate = true)
    private int mWeightId;
    @ColumnInfo(name = "Weight")
    private float mWeight;

    public Weight (@NonNull float weight)
    {
        this.mWeight = weight;
    }

    public float getmWeight() {
        return mWeight;
    }

    public int getmWeightId() {
        return mWeightId;
    }
}
