public class SinhVienService {
    public boolean suaSinhVien(SinhVien sv, String tenMoi, float diemMoi) {
        if (tenMoi == null || tenMoi.trim().isEmpty()) {
            throw new IllegalArgumentException("tên mới ko đc để trống");
        }
        if (diemMoi <0 || diemMoi > 10) {
            throw new IllegalArgumentException("điểm mới phải hợp lệ");
        }
        sv.setTen(tenMoi);
        sv.setDiemTrungBinh(diemMoi);
        return true;
    }
}
