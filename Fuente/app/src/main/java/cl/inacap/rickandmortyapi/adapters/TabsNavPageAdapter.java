package cl.inacap.rickandmortyapi.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import cl.inacap.rickandmortyapi.PersonajesFragment;
import cl.inacap.rickandmortyapi.UbicacionesFragment;

public class TabsNavPageAdapter extends FragmentStatePagerAdapter {


    public TabsNavPageAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new PersonajesFragment();
            case 1: return new UbicacionesFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
