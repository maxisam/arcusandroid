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
package arcus.app.common.banners;

import android.view.View;

import arcus.app.R;
import arcus.app.activities.FullscreenFragmentActivity;
import arcus.app.common.banners.core.ClickableBanner;
import arcus.app.common.error.fragment.LutronDeviceDeletedFragment;



public class LutronDeviceDeletedBanner extends ClickableBanner {

    public LutronDeviceDeletedBanner(final String revokedDeviceAddress, final String supportUrl) {
        super(R.layout.banner_lutron_device_deleted);

        setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FullscreenFragmentActivity.launch(getActivity(), LutronDeviceDeletedFragment.class);
            }
        });
    }
}
