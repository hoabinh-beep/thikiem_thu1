import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinhVienServiceTest {
    SinhVienService service = new SinhVienService();

    @Test
    public void testSuaDiem_GiaTriBien() {
        SinhVien sv = new SinhVien();
        assertTrue(service.suaSinhVien(sv, "Nguyen van a", 0f));
        assertEquals(0f, sv.getDiemTrungBinh());

        assertTrue(service.suaSinhVien(sv, "Nguyen Van b", 10f));
        assertEquals(10f, sv.getDiemTrungBinh());
    }

    @Test
    public void testSuaDiem_Ngoaibien() {
        SinhVien sv = new SinhVien();
        assertThrows(IllegalArgumentException.class, () -> service.suaSinhVien(sv, "test", -1f));
        assertThrows(IllegalArgumentException.class, () -> service.suaSinhVien(sv, "test", 11f));
    }

    @Test
    public void testValidate_DeTrong() {
        SinhVien sv = new SinhVien();
        assertThrows(IllegalArgumentException.class, () -> service.suaSinhVien(sv, "", 5f));
    }
}
