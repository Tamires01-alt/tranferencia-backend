package controller.controller;


import controller.entity.Transfer;
import controller.service.TransferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transfers")
public class TransferController {

  private final TransferService transferService;

  public TransferController(TransferService transferService) {
    this.transferService = transferService;
  }

  @PostMapping
  public Transfer scheduleTransfer(@RequestBody Transfer transfer) {
    return transferService.scheduleTransfer(transfer);
  }

  @GetMapping
  public List<Transfer> getAllTransfers() {
    return transferService.getAllTransfers();
  }
}