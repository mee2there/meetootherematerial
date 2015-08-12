package innovation.meetoothere.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import innovation.meetoothere.R;

/**
 * Created by Windows on 23-01-2015.
 */
public class FragmentMyEvents extends Fragment {



    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FragmentMyEvents() {
    }


    public static FragmentMyEvents newInstance(String param1, String param2) {
        FragmentMyEvents fragment = new FragmentMyEvents();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_myevents, container, false);
        Bundle bundle = getArguments();
        return layout;

    }


}