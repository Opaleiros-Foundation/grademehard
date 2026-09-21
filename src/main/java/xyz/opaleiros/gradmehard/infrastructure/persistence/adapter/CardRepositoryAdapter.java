package xyz.opaleiros.gradmehard.infrastructure.persistence.adapter;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import xyz.opaleiros.gradmehard.domain.exception.CardNotFoundException;
import xyz.opaleiros.gradmehard.domain.repository.CardRepository;
import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.CardJpaEntity;
import xyz.opaleiros.gradmehard.infrastructure.persistence.repository.JpaCardRepository;

import java.util.Optional;

@Repository
public class CardRepositoryAdapter implements CardRepository {

    private final JpaCardRepository repository;

    public CardRepositoryAdapter(JpaCardRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(CardJpaEntity cardJpaEntity) {
        this.repository.save(cardJpaEntity);
    }

    @Override
    public CardJpaEntity findById(String uuid) {
        Optional<CardJpaEntity> cardFound = this.repository.findById(uuid);
        if (cardFound.isEmpty()) throw new CardNotFoundException(uuid);

        return cardFound.get();
    }

    @Override
    public Page<CardJpaEntity> findAllPageable(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

    @Override
    public void updateOverall(String uuid, Double overall) {
        CardJpaEntity cardJpaEntityFound = this.findById(uuid);
        cardJpaEntityFound.setOverall(overall);
        this.save(cardJpaEntityFound);
    }

    @Override
    public void delete(String uuid) {
        CardJpaEntity cardJpaEntityToDelete = this.findById(uuid);
        this.repository.delete(cardJpaEntityToDelete);
    }
}
