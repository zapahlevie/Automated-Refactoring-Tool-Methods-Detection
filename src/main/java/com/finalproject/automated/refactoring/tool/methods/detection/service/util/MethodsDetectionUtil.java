package com.finalproject.automated.refactoring.tool.methods.detection.service.util;

import com.finalproject.automated.refactoring.tool.files.detection.model.FileModel;
import lombok.NonNull;

/**
 * @author M. Reza Pahlevi
 * @version 1.0.0
 * @since 27 April 2019
 */

public interface MethodsDetectionUtil {

    String getMethodKey(@NonNull FileModel fileModel);
}
