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
package arcus.app.common.cards;

import android.content.Context;

import arcus.app.R;


public class PetControlCard extends DeviceControlCard {

    public final static String TAG = "PET CONTROL CARD";
    private String mStatus = "";

    public PetControlCard(Context context) {
        super(context);
        super.setTag(TAG);

    }

    @Override
    public int getLayout() {
        return R.layout.card_pet_control;
    }


    public String getPetDoorStatus() {
        return mStatus;
    }

    public void setPetDoorStatus(String str){
        mStatus = str;
    }
}
