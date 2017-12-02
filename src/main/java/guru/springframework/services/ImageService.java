package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ujwal-mac on 12/2/17.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
