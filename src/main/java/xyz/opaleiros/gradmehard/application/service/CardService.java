package xyz.opaleiros.gradmehard.application.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import xyz.opaleiros.gradmehard.application.dto.CardUserDTO;
import xyz.opaleiros.gradmehard.application.usecase.card.*;
import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.CardJpaEntity;

@Service
public class CardService implements CardCreateCardUseCase, CardDeleteUseCase, CardFindByIdUseCase, CardFindAllPageableUseCase, CardUpdateOverall {
    @Override
    public void create(CardUserDTO dto) {

    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Page<CardJpaEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public CardJpaEntity findById(String uuid) {
        return null;
    }

    @Override
    public void delete(String uuid, Double overall) {

    }
}
