package top.legend.http.database;

import com.raizlabs.android.dbflow.annotation.Database;
import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/15
 */
@Database(name = "app", version = 1)
public class AppDatabase {



    @Migration(version = 2, database = AppDatabase.class)
    public static class AddEmailToUserMigration extends AlterTableMigration<String> {

        public AddEmailToUserMigration(Class<String> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.TEXT, "email");
        }
    }
}
