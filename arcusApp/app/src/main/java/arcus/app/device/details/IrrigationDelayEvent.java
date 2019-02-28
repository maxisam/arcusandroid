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
package arcus.app.device.details;

public class IrrigationDelayEvent {

    private int delayTime;
    private String deviceAddress;

    public IrrigationDelayEvent(String deviceAddress, int delayTime) {
        this.deviceAddress = deviceAddress;
        this.delayTime = delayTime;
    }

    public int getDelayTime() {
        return this.delayTime;
    }

    public String getDeviceAddress() {
        return this.deviceAddress;
    }
}
