package ma.projet.headphones.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import ma.projet.headphones.Adapter.CategoryAdapter;
import ma.projet.headphones.Adapter.PopularAdapter;
import ma.projet.headphones.Domain.Category;
import ma.projet.headphones.Domain.Popular;
import ma.projet.headphones.FavorActivity;
import ma.projet.headphones.R;
import ma.projet.headphones.ShopsActivity;
import ma.projet.headphones.UserActivity;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter , adapter2;
    private RecyclerView recyclerViewCategory , recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            if(item.getItemId() == R.id.nav_home){
                return true;
            }else if(item.getItemId() == R.id.nav_shop){
                startActivity(new Intent(getApplicationContext(), ShopsActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }else if(item.getItemId() == R.id.nav_fav){
                startActivity(new Intent(getApplicationContext(), FavorActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }else if(item.getItemId() == R.id.nav_user){
                startActivity(new Intent(getApplicationContext(), UserActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            return false;
        });
    }
    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategory=findViewById(R.id.recyclerView2);
        recyclerViewCategory.setLayoutManager(linearLayoutManager);


        ArrayList<Category> category=new ArrayList<>();
        category.add(new Category("Apple",R.drawable.apple));
        category.add(new Category("Sony",R.drawable.sonyy ));
        category.add(new Category("Beats",R.drawable.beatspill));
        category.add(new Category("Jbl",R.drawable.jbl ));
        category.add(new Category("Senheiser",R.drawable.sennh));
        category.add(new Category("Nike",R.drawable.nikee));
        // LinearLayoutManager linearLayoutManager1= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL false);


        adapter=new CategoryAdapter(this,category);
        recyclerViewCategory.setAdapter(adapter);


    }
    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerViewPopular=findViewById(R.id.recyclerView3);
        recyclerViewPopular.setLayoutManager(linearLayoutManager);


        ArrayList<Popular> popular=new ArrayList<>();
        popular.add(new Popular("apple","$ 300",R.drawable.cat1));
        popular.add(new Popular("Sony","$ 500",R.drawable.cat2 ));
        popular.add(new Popular("Beats","$ 470",R.drawable.cat3));
        popular.add(new Popular("Jbl","$ 400",R.drawable.cat4 ));
        popular.add(new Popular("Senheiser","$ 200",R.drawable.cat5));
        popular.add(new Popular("Nike","$ 190",R.drawable.cat6));
        popular.add(new Popular("Apple","$ 230",R.drawable.cat7));
        popular.add(new Popular("Sony","$ 520",R.drawable.cat8 ));
        popular.add(new Popular("Beats","$ 390",R.drawable.cat9));
        popular.add(new Popular("Apple","$ 230",R.drawable.cat10));
        popular.add(new Popular("Sony","$ 520",R.drawable.cat11 ));
        popular.add(new Popular("Beats","$ 390",R.drawable.cat12));

        // LinearLayoutManager linearLayoutManager1= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL false);

        adapter2=new PopularAdapter(this,popular);
        recyclerViewPopular.setAdapter(adapter2);

        recyclerViewPopular.setLayoutManager(new GridLayoutManager(this,3));
        recyclerViewPopular.suppressLayout(true);


    }
}


