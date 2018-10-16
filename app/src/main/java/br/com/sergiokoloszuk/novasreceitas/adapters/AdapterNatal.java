package br.com.sergiokoloszuk.novasreceitas.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class AdapterNatal extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentsFestaJunina;

    public AdapterNatal(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragmentsFestaJunina = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsFestaJunina.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsFestaJunina.size();
    }
}