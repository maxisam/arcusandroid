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
package arcus.cornea.subsystem.climate.model;

import arcus.cornea.utils.DayOfWeek;

import java.util.List;


public class ScheduledDay {
    private DayOfWeek dayOfWeek;
    private List<ScheduledSetPoint> setPoints;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public List<ScheduledSetPoint> getSetPoints() {
        return setPoints;
    }

    public void setSetPoints(List<ScheduledSetPoint> setPoints) {
        this.setPoints = setPoints;
    }

    @Override
    public String toString() {
        return "ScheduledDay{" +
                "dayOfWeek=" + dayOfWeek +
                ", setPoints=" + setPoints +
                '}';
    }
}
