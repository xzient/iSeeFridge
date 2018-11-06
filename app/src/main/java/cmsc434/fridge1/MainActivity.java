package cmsc434.fridge1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mDrawerLayout = findViewById(R.id.drawer_layout_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        //setTitle("Saul"); //This will be changed to current user's name

        mNavigationView = findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);


        //In case the app is flipped, to not lose current instance
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            mNavigationView.setCheckedItem(R.id.nav_home);
        }

    }



    //Navigator Options
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

                break;
            case R.id.nav_notes:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new NotesFragment()).commit();

                break;
            case R.id.nav_inventory:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new InventoryFragment()).commit();

                break;
            case R.id.nav_shopping_list:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ShoppingListFragment()).commit();

                break;
            case R.id.nav_meals:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MealsFragment()).commit();

                break;
            case R.id.nav_users:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new UsersFragment()).commit();

                break;
            case R.id.nav_add_to_inventory:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AddToInventoryFragment()).commit();

                break;
            case R.id.nav_user_parameters:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new UserParametersFragment()).commit();

                break;
            case R.id.nav_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingsFragment()).commit();

                break;


        }
        mDrawerLayout.closeDrawer(GravityCompat.END);

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    //Top App Bar options
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_home:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                mNavigationView.setCheckedItem(R.id.nav_home);
                break;

            case R.id.action_user:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new UsersFragment()).commit();
                mNavigationView.setCheckedItem(R.id.nav_users);

                break;

            case R.id.action_add:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AddToInventoryFragment()).commit();
                mNavigationView.setCheckedItem(R.id.nav_add_to_inventory);
                break;

            case R.id.action_menu:


                mDrawerLayout.openDrawer(Gravity.END);
                break;
            default:
                return false;
        }

        return super.onOptionsItemSelected(item);
    }

}
