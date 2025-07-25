package com.growwithme.crops.interfaces.acl;

import com.growwithme.crops.domain.model.aggregates.Crop;
import com.growwithme.crops.domain.model.valueobjects.CropCategory;
import com.growwithme.crops.domain.model.valueobjects.CropStatus;
import java.util.List;
import java.util.Optional;

public interface CropContextFacade {
    Long createCrop(Long farmerId, String productName, String code, CropCategory category, Float area, String location);

    List<Crop> fetchAllCropsByFarmerId(Long farmerId);

    Optional<Crop> fetchCropById(Long cropId);
}
