package com.example.android.swipeimages;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ImageAdapterFrag extends FragmentStateAdapter {

    public ImageAdapterFrag(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return ImageShowFragment.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
