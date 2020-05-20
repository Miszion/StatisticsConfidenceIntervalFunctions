class Main {


public static double calculateE(double zPlus, int x1, int x2, int n1, int n2) {

	double p1hat = (double)((double)x1/ (double)n1);
	double p2hat = (double)((double)x2/ (double)n2);
	double q1hat = 1 - p1hat;
	double q2hat = 1 - p2hat;
  	return zPlus * (Math.pow(((p1hat * q1hat)/n1) + ((p2hat * q2hat)/n2), .5));
}

public static double calculateT(double x1, double x2, int n1, int n2, double sp) {
	double subTract = x1 - x2;
	double squaredSp = Math.pow(sp, 2);
	double sqrtFun = Math.pow(((squaredSp/n1) + (squaredSp/ n2)), .5);
	return subTract / sqrtFun;
}

public static double testStatistic(int X1, int X2, int n1, int n2) {
	double p1 = (double)X1/ (double)n1;
	double p2= (double)X2/ (double)n2;
	double p = (double)((double)(X1 + X2) / (double)(n1 + n2));
	return (p1- p2) / (Math.pow((p * (1-p) * ((1/(double)n1) + (1/(double)n2)) ), .5));
}

public static double testConfidencePlus(double zScore, int X1, int X2, int n1, int n2) {
	double p1 = (double)X1/ (double)n1;
	double p2= (double)X2/ (double)n2;
	double p = (double)((double)(X1 + X2) / (double)(n1 + n2));
	return (p1- p2) + zScore * (Math.pow((double)((p1 * (1-p1))/(double)n1) + (double)((p2 * (1-p2))/(double)n2), .5));
}

public static double testConfidenceMinus(double zScore, int X1, int X2, int n1, int n2) {
	double p1 = (double)X1/ (double)n1;
	double p2= (double)X2/ (double)n2;
	double p = (double)((double)(X1 + X2) / (double)(n1 + n2));
	return (p1- p2) - (zScore * (Math.pow((double)((p1 * (1-p1))/(double)n1) + (double)((p2 * (1-p2))/(double)n2), .5)));
}


  public static void main(String[] args) {
    //System.out.println(calculateE(2.575, 43, 90, 49, 105));
    //System.out.println(testStatistic(66, 10, 307, 298));
    // System.out.println(testConfidencePlus(2.33, 34, 17, 2816, 7695));
    // System.out.println(testConfidenceMinus(2.33, 34, 17, 2816, 7695));
    //System.out.println(testStatistic(34, 17, 2816, 7695));
    //System.out.println(testStatistic(116, 22, 148, 150));
    System.out.println(testConfidencePlus(2.326, 116, 22, 148, 150));
    System.out.println(testConfidenceMinus(2.326, 116, 22, 148, 150));
  }
}