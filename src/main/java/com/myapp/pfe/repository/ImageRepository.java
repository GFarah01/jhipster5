package com.myapp.pfe.repository;

import com.myapp.pfe.domain.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {
}
