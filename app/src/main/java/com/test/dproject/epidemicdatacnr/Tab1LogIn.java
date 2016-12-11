package com.test.dproject.epidemicdatacnr;

/**
 * Created by Subhashinie on 12/3/2016.
 */

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Tab1LogIn extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_log_in, container, false);
        final Button pRegButton = (Button) rootView.findViewById(R.id.pRegButton);

        pRegButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent pReg = new Intent(getActivity(), patientRegistration.class);
                        getActivity().startActivity(pReg);
                    }
                }
        );
        return rootView;
    }


}