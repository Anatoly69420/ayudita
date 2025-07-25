package com.growwithme.consultations.application.internal.queryservices;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.growwithme.consultations.domain.model.aggregates.Consultation;
import com.growwithme.consultations.domain.model.queries.GetAllConsultationsByFarmerIdQuery;
import com.growwithme.consultations.domain.model.queries.GetAllConsultationsQuery;
import com.growwithme.consultations.domain.services.ConsultationQueryService;
import com.growwithme.consultations.infrastructure.persistence.jpa.repositories.ConsultationRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class ConsultationQueryServiceImpl implements ConsultationQueryService {
    private final ConsultationRepository repository;

    @Override
    public List<Consultation> handle(GetAllConsultationsQuery query) {
        return repository.findAll();
    }

    @Override
    public List<Consultation> handle(GetAllConsultationsByFarmerIdQuery query) {
        return repository.findAllByFarmerUser_Id(query.farmerId());
    }
}
