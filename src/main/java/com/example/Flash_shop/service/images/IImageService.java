package com.example.Flash_shop.service.images;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.Flash_shop.dto.ImageDto;
import com.example.Flash_shop.model.Image;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file,  Long imageId);
}
