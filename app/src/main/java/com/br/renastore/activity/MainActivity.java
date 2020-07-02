package com.br.renastore.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.br.renastore.R;
import com.br.renastore.helper.ConfiguracaoFirebase;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private FirebaseAuth autenticacao;
    private int[] carousel_imagens = new int[] {
      R.drawable.carousel_camisa1, R.drawable.carousel_camisa2, R.drawable.carousel_camisa3, R.drawable.carousel_camisa4, R.drawable.carousel_camisa5,
    };
    private String[] carousel_titles = new String[]{
            "shirt1", "shirt2", "shirt3", "shirt4", "shirt5"
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        configureCarousel();




        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //configuracao de objetos
       // autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();

      //  inicializarComponentes();

        //configuraBottomNavigationView();

   /*     FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.viewPage, new FeedFragment()).commit();
*/



    }

    private void configureCarousel (){
        final CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(carousel_imagens.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(carousel_imagens[position]);
            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity.this, carousel_titles[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
/*
    /**
     * Método responsável por tratar eventos de click na BottomNavigation
     * @param viewEx
     */
/*
    private void habilitarNavegacao(BottomNavigationViewEx viewEx){

        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


                switch (item.getItemId()){
                    case R.id.ic_home :
                        fragmentTransaction.replace(R.id.viewPage, new FeedFragment()).commit();
                        return true;
                    case R.id.ic_pesquisa :
                        fragmentTransaction.replace(R.id.viewPage, new PesquisaFragment()).commit();
                        return true;
                    case R.id.ic_postagem :
                        fragmentTransaction.replace(R.id.viewPage, new PostagemFragment()).commit();
                        return true;
                    case R.id.ic_perfil :
                        fragmentTransaction.replace(R.id.viewPage, new PerfilFragment()).commit();
                        return true;
                }

                return false;
            }
        });
    }*/

  /*  private void configuraBottomNavigationView(){
        BottomNavigationViewEx bottomNavigationItemViewEx = findViewById(R.id.bottomNavigation);


        //Fazer configurações iniciais do Bottom Navigation
        bottomNavigationItemViewEx.enableAnimation(false);
        bottomNavigationItemViewEx.enableItemShiftingMode(true);
        bottomNavigationItemViewEx.enableShiftingMode(false);
        bottomNavigationItemViewEx.setTextVisibility(true);

        //Habilitar navegação
        habilitarNavegacao( bottomNavigationItemViewEx);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate the menu; this add items to the action bar if it is present
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_toolbar, menu);

        //Configurando botao search
     //   MenuItem item = menu.findItem(R.id.search);

     //   searchView.setMenuItem( item );


        return super.onCreateOptionsMenu(menu);
    }
/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (item.getItemId()){
            case R.id.favorite:
                //FAZ ALGUMA COISA
                Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.notification:
                //FAZ ALGUMA COISA
                Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                //FAZ ALGUMA COISA
                Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }

   /* private void inicializarComponentes(){
        searchView = findViewById(R.id.material_search_view);
    }*/
}
