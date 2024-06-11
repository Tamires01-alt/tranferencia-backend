package controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import controller.entity.Transfer;


public interface TransferRepository extends JpaRepository<Transfer, Long> {
}