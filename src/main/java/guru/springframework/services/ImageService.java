package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Silviu_Titirca on 12/14/2021
 */
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
