package br.com.sergiokoloszuk.novasreceitas;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.sergiokoloszuk.novasreceitas.adapters.AdapterFestaJunina;
import br.com.sergiokoloszuk.novasreceitas.adapters.AdapterHalloween;
import br.com.sergiokoloszuk.novasreceitas.adapters.AdapterInfantil;
import br.com.sergiokoloszuk.novasreceitas.adapters.AdapterLuau;
import br.com.sergiokoloszuk.novasreceitas.adapters.AdapterNatal;
import br.com.sergiokoloszuk.novasreceitas.adapters.AdapterPiquenique;
import br.com.sergiokoloszuk.novasreceitas.fragments.FragmentFestaJunina;
import br.com.sergiokoloszuk.novasreceitas.fragments.FragmentHalloween;
import br.com.sergiokoloszuk.novasreceitas.fragments.FragmentInfantil;
import br.com.sergiokoloszuk.novasreceitas.fragments.FragmentLuau;
import br.com.sergiokoloszuk.novasreceitas.fragments.FragmentNatal;
import br.com.sergiokoloszuk.novasreceitas.fragments.FragmentPiquenique;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerFestaJunina;
    private ViewPager viewPagerHalloween;
    private ViewPager viewPagerInfantil;
    private ViewPager viewPagerLuau;
    private ViewPager viewPagerNatal;
    private ViewPager viewPagerPiquenique;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        viewPagerFestaJunina = findViewById( R.id.view_junina );
        List<Fragment> fragmentsFestaJunina = getFragmentsFestaJunina();
        AdapterFestaJunina pageAdapterFestaJunina = new AdapterFestaJunina( getSupportFragmentManager(), fragmentsFestaJunina );
        viewPagerFestaJunina.setAdapter( pageAdapterFestaJunina );

        viewPagerHalloween = findViewById( R.id.view_halloween );
        List<Fragment> fragmentsHalloween = getFragmentsHalloween();
        AdapterHalloween pageAdapterHalloween = new AdapterHalloween( getSupportFragmentManager(), fragmentsHalloween);
        viewPagerHalloween.setAdapter( pageAdapterHalloween );

        viewPagerInfantil = findViewById( R.id.view_infantil );
        List<Fragment> fragmentsInfantil = getFragmentsInfantil();
        AdapterInfantil pageAdapterInfantil = new AdapterInfantil( getSupportFragmentManager(), fragmentsInfantil );
        viewPagerInfantil.setAdapter( pageAdapterInfantil );

        viewPagerLuau = findViewById( R.id.view_luau );
        List<Fragment> fragmentsLuau = getFragmentsLuau();
        AdapterLuau pageAdapterLuau = new AdapterLuau( getSupportFragmentManager(), fragmentsLuau );
        viewPagerLuau.setAdapter( pageAdapterLuau );

        viewPagerNatal = findViewById( R.id.view_natal );
        List<Fragment> fragmentsNatal = getFragmentsNatal();
        AdapterNatal pageAdapterNatal = new AdapterNatal( getSupportFragmentManager(), fragmentsNatal );
        viewPagerNatal.setAdapter( pageAdapterNatal );

        viewPagerPiquenique = findViewById( R.id.view_piquenique );
        List<Fragment> fragmentsPiquenique = getFragmentsPiquenique();
        AdapterPiquenique pageAdapterPiquenique = new AdapterPiquenique( getSupportFragmentManager(), fragmentsPiquenique );
        viewPagerPiquenique.setAdapter( pageAdapterPiquenique );
    }

    @NonNull
    private List<Fragment> getFragmentsFestaJunina() {
        List<Fragment> fragmentsFestaJunina = new ArrayList<>();

        Fragment fragments = FragmentFestaJunina.newInstance( R.drawable.receitas_festa_junina_bolo_de_fuba, "Bolo de Fubá" );

        fragmentsFestaJunina.add( fragments );
        fragmentsFestaJunina.add( FragmentFestaJunina.newInstance( R.drawable.receita_festa_junina_curau, "Curau" ) );
        fragmentsFestaJunina.add( FragmentFestaJunina.newInstance( R.drawable.receita_festa_junina_cocada_de_colher, "Cocada de Colher" ) );
        return fragmentsFestaJunina;
    }

    @NonNull
    private List<Fragment> getFragmentsHalloween() {
        List<Fragment> fragmentsHalloween = new ArrayList<>();

        Fragment fragments = FragmentHalloween.newInstance( R.drawable.receitas_halloween_biscoito_boca, "Biscoito boca" );

        fragmentsHalloween.add( fragments );
        fragmentsHalloween.add( FragmentHalloween.newInstance( R.drawable.receitas_halloween_biscoito_mumia, "Biscoito mumia" ) );
        fragmentsHalloween.add( FragmentHalloween.newInstance( R.drawable.receitas_halloween_dedos_biscoitos, "Biscoito dedos" ) );
        return fragmentsHalloween;
    }

    @NonNull
    private List<Fragment> getFragmentsInfantil() {
        List<Fragment> fragmentsInfantil = new ArrayList<>();

        Fragment fragments = FragmentInfantil.newInstance( R.drawable.receitas_festa_infantil_bicho_de_pe, "Bicho de pé" );

        fragmentsInfantil.add( fragments );
        fragmentsInfantil.add( FragmentInfantil.newInstance( R.drawable.receitas_festa_infantil_brigadeiro, "Brigadeiro" ) );
        fragmentsInfantil.add( FragmentInfantil.newInstance( R.drawable.receitas_festa_infantil_mini_hotdog, "Mini Hot Dog" ) );
                return fragmentsInfantil;

    }

    @NonNull
    private List<Fragment> getFragmentsLuau() {
        List<Fragment> fragmentsLuau = new ArrayList<>();

        Fragment fragments = FragmentLuau.newInstance( R.drawable.receitas_luau_batida_de_abacaxi, "Batida de Abacaxi" );

        fragmentsLuau.add( fragments );
        fragmentsLuau.add( FragmentLuau.newInstance( R.drawable.receitas_luau_coco_com_frutas, "Coco com frutas" ) );
        fragmentsLuau.add( FragmentLuau.newInstance( R.drawable.receitas_luau_drink_flamingo, "Drink Flamingo" ) );
        return fragmentsLuau;
    }

    @NonNull
    private List<Fragment> getFragmentsNatal() {
        List<Fragment> fragmentsNatal = new ArrayList<>();

        Fragment fragments = FragmentNatal.newInstance( R.drawable.receitas_natal_chester_com_figo, "Chester com figo" );

        fragmentsNatal.add( fragments );
        fragmentsNatal.add( FragmentNatal.newInstance( R.drawable.receitas_natal_pizza_natalina, "Pizza natalina" ) );
        fragmentsNatal.add( FragmentNatal.newInstance( R.drawable.receitas_natal_tender, "Tender" ) );
        return fragmentsNatal;
    }

    @NonNull
    private List<Fragment> getFragmentsPiquenique() {
        List<Fragment> fragmentsPiquenique = new ArrayList<>();

        Fragment fragments = FragmentPiquenique.newInstance( R.drawable.receitas_piquenique_brownie_chocolate, "Brownie de chocolate" );

        fragmentsPiquenique.add( fragments );
        fragmentsPiquenique.add( FragmentPiquenique.newInstance( R.drawable.receitas_piquenique_geleia_de_morango, "geléia de morango" ) );
        fragmentsPiquenique.add( FragmentPiquenique.newInstance( R.drawable.receitas_piquenique_torta_de_maca, "Torta de maçã" ) );
        return fragmentsPiquenique;
    }
}



    