package BT;

public class TriangleClassifier {
    public static String result(int edgeA, int edgeB, int edgeC){
        boolean checkEdge = edgeA >0 && edgeB > 0 && edgeC > 0;
        boolean checkTriangle = (edgeA + edgeB) > edgeC && (edgeA + edgeC) > edgeB && (edgeB + edgeC) > edgeA;

        if (checkTriangle && checkEdge){
            if (edgeA == edgeB|| edgeA == edgeC || edgeB == edgeC){
                if (edgeA == edgeB && edgeA == edgeC) return "Tam giác đều";
                else return "Tam giác cân";
            } else return "Tam giác thường";
        } else return "Không phải là tam giác";

    }
}
