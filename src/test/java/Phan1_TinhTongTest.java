import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Phan1_TinhTongTest {
    Phan1_TinhTong pt = new Phan1_TinhTong();

    @Test
    public void testGiaTriBien() {
        int[] arr = {0, 1, 1000, 1001};
        assertEquals(1001, pt.tinhTongMang(arr));
    }

    @Test
    public void testPhanVungTuongDuong_Hople() {
        int[] arr = {500, 200};
        assertEquals(700, pt.tinhTongMang(arr));
    }

    @Test
    public void testPhanVungTuongDuong_Khonghople() {
        int[] arr = {-5, 2000};
        assertEquals(0, pt.tinhTongMang(arr));
    }
}
