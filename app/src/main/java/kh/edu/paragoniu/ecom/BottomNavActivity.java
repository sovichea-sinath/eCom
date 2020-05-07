package kh.edu.paragoniu.ecom;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView bottomNav = findViewById(R.id.bootom_nav);
        bottomNav.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.mnu_favorites) {
            Toast.makeText(this, R.string.favorites, Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.mnu_contacts) {
            Toast.makeText(this, R.string.contacts, Toast.LENGTH_LONG).show();
        }

        return true;
    }
}
