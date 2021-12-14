package guru.springframework.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Silviu_Titirca on 12/14/2021
 */
@Slf4j
@Service
public class ImageServiceImpl implements ImageService{

    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {

        log.debug("Received a file");

    }

}
