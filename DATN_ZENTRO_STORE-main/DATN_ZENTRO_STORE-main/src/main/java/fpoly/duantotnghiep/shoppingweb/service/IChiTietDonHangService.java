package fpoly.duantotnghiep.shoppingweb.service;

import java.util.List;

public interface IChiTietDonHangService {
    List<ChiTietDonHangDtoResponse> getByDonHang(String maDonHang);

    ChiTietDonHangDtoResponse findById(String id);
    void save(ChiTietDonHangDTORequest chiTietDonHang);
}
