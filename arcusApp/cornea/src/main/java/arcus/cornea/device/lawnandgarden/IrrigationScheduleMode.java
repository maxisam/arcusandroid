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
package arcus.cornea.device.lawnandgarden;

public enum IrrigationScheduleMode {
    WEEKLY,
    INTERVAL,
    ODD,
    EVEN,
    MANUAL;

    public String asString() {
        switch (this) {
            case WEEKLY:
                return "Weekly";

            case INTERVAL:
                return "Interval";

            case ODD:
                return "Odd Days";

            case EVEN:
                return "Even Days";

            default:
            case MANUAL:
                return "Manual";
        }
    }
}
