class eighth_34 {
    public static void main(String[] args) {
        double[][] points = {
                // 		 x, y
                {5.6, -9},
                {8, 1},
                {1.5, 2.5},
                {6.5, -9},
                {10, 2.5},
                {-3, 4.5}
        };
        getIntersectingPoint(points);
    }

    public static void getIntersectingPoint(double[][] points) {
        //===========Sorted multidemetion array via 0 column==============
        for (int i = 0; i < points.length - 1; i++) {
            double minX = points[i][0];
            int minIndex = i;
            for (int j = i + 1; j < points.length; j++) {
                double minXO = points[j][0];
                int maxIndex = j;
                if (minXO > minX) {
                    double[] temp = points[minIndex];
                    points[minIndex] = points[maxIndex];
                    points[maxIndex] = temp;
                }
            }
        }

        //===========Find lowest amount 1 column==============
        double minX = points[0][0];
        double minY = points[0][1];

        for (int j = 0; j < points.length; j++) {
            if (minY > points[j][1]) {
                minY = points[j][1];
                minX = points[j][0];
            }

        }

        System.out.println(minX + "," + minY);
    }
}