package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        Place place = new Place(0, 0);
        int cornerRow = 0;
        int cornerColumn = 0;
        if (places[cornerRow][cornerColumn] == null && places[cornerRow][cornerColumn + 1] == null && places[cornerRow + 1][cornerColumn] == null) {
            place = new Place(cornerRow, cornerColumn);
        } else {
            for (int i = 0; i < places.length - 2; i++) {
                for (int j = 0; j < places[i].length - 2; j++) {
                    if (places[i][j] == null && places[i][j + 1] == null && places[i][j + 2] == null) {
                        place = new Place(i, j + 1);
                        break;
                    } else if (places[i][j] == null && places[i + 1][j] == null && places[i + 2][j + 2] == null) {
                        place = new Place(i + 1, j);
                        break;
                    } else {
                        place = null;
                    }
                }
            }
        }
        return place;
    }

    public static class Place {
        private int row;
        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}