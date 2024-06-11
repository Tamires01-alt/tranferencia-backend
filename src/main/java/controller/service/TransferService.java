package controller.service;

import controller.repository.TransferRepository;
import controller.entity.Transfer;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class TransferService {

  private final TransferRepository transferRepository;

  public TransferService(TransferRepository transferRepository) {
    this.transferRepository = transferRepository;
  }

  public Transfer scheduleTransfer(Transfer transfer) {
    transfer.setSchedulingDate(LocalDate.now());
    transfer.setFee(calculateFee(transfer.getAmount(), transfer.getTransferDate()));
    return transferRepository.save(transfer);
  }

  public List<Transfer> getAllTransfers() {
    return transferRepository.findAll();
  }

  private double calculateFee(double amount, LocalDate transferDate) {
    long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), transferDate);

    if (daysBetween == 0) {
      return 3.00 + amount * 0.025;
    } else if (daysBetween <= 10) {
      return 12.00;
    } else if (daysBetween <= 20) {
      return amount * 0.082;
    } else if (daysBetween <= 30) {
      return amount * 0.069;
    } else if (daysBetween <= 40) {
      return amount * 0.047;
    } else if (daysBetween <= 50) {
      return amount * 0.017;
    } else {
      throw new IllegalArgumentException("Data de transferência muito distante no futuro.");
    }
  }
}