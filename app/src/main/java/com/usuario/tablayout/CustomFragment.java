package com.usuario.tablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.usuario.tablayout.R;

public class CustomFragment extends Fragment {
    public static final String KEY_REG_TEXT = "text";
    private TextView txvFragment;

    public CustomFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        // Inflamos la Vista que se debe mostrar en pantalla.
        View rootView = inflater.inflate(R.layout.fragment_layout, container,
                false);
        // Creamos instancia del TextView.
        txvFragment = (TextView) rootView.findViewById(R.id.txv_fragment);
        // Recogemos el texto que guardamos al crear el Fragment.
        String text = getArguments().getString(KEY_REG_TEXT);
        // Mostramos el texto en el TextView.
        txvFragment.setText(text);

        // Devolvemos la vista para que se muestre en pantalla.
        return rootView;
    }

    public static CustomFragment newInstance(Bundle arguments) {
        CustomFragment customFragment = new CustomFragment();

        if (arguments != null)
            customFragment.setArguments(arguments);

        return customFragment;
    }
}
