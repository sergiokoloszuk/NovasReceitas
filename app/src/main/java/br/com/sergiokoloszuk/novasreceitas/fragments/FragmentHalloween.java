package br.com.sergiokoloszuk.novasreceitas.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.sergiokoloszuk.novasreceitas.R;

public class FragmentHalloween extends Fragment {

    public FragmentHalloween() {
    }

    public static FragmentFestaJunina newInstance(int image, String text) {
        Bundle args = new Bundle();

        args.putInt( "IMAGE", image );
        args.putString( "TEXT", text );

        FragmentFestaJunina fragment = new FragmentFestaJunina();
        fragment.setArguments( args );
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_halloween, container, false );

        ImageView imageViewPhoto = view.findViewById( R.id.img_biscoito_boca );
        TextView textViewTitle = view.findViewById( R.id.txt_biscoito_boca );

        int imageResource = getArguments().getInt( "IMAGE" );
        String textTitle = getArguments().getString( "TEXT" );

        imageViewPhoto.setImageResource( imageResource );
        textViewTitle.setText( textTitle );

        return view;
    }
}
