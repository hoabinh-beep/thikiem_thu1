public class Phan1_TinhTong {
    public int tinhTongMang(int[] arr) {
    if (arr == null) return 0;
    int sum = 0;
    for (int num : arr) {
    if (num >= 1 && num <= 1000) {
        sum += num;
    }
    }
    return sum;
    }
}
