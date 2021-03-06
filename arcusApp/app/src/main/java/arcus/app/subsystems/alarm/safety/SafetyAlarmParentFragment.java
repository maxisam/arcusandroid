/*
 *  Copyright 2019 Arcus Project.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package arcus.app.subsystems.alarm.safety;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import arcus.app.R;
import arcus.app.common.fragments.HeaderNavigationViewPagerFragment;

import java.util.ArrayList;
import java.util.List;


public class SafetyAlarmParentFragment extends HeaderNavigationViewPagerFragment {

    @NonNull
    public static SafetyAlarmParentFragment newInstance(int position){
        SafetyAlarmParentFragment fragment = new SafetyAlarmParentFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(SELECTED_POSITION,position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle(getTitle());
    }

    @NonNull
    @Override
    public String getTitle() {
        return getActivity().getString(R.string.safety_alarm);
    }

    @NonNull
    @Override
    protected List<Fragment> getFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(SafetyAlarmFragment.newInstance());
        fragments.add(SafetyAlarmMoreFragment.newInstance());
        return fragments;
    }

    @NonNull
    @Override
    protected String[] getTitles() {
        String[] titles = {"STATUS", "MORE"};
        return titles;
    }
}
