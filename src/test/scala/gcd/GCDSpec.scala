// See README.md for license details.

package gcd

import chisel3._
import chiseltest._
import org.scalatest.freespec.AnyFreeSpec
import chisel3.experimental.BundleLiterals._

/**
  * This is a trivial example of how to run this Specification
  * From within sbt use:
  * {{{
  * testOnly gcd.GcdDecoupledTester
  * }}}
  * From a terminal shell use:
  * {{{
  * sbt 'testOnly gcd.GcdDecoupledTester'
  * }}}
  */
class GCDSpec extends AnyFreeSpec with ChiselScalatestTester {
    // printf("hello world")
  val x = 123.U
  println(x.litValue)
  // val reg = Vec(32, UInt(32.W))
  // reg := Seq.fill(32)(0.U(32.W))
  // val test2 = 13.U(32.W)
  // test2 := "h0".U(32.W)
  // println(reg(10))
  // "Gcd should calculate proper greatest common denominator" in {
  //   test(new DecoupledGcd(16)) { dut =>
  //     dut.input.initSource()
  //     dut.input.setSourceClock(dut.clock)
  //     dut.output.initSink()
  //     dut.output.setSinkClock(dut.clock)

  //     val testValues = for { x <- 0 to 10; y <- 0 to 10} yield (x, y)
  //     val inputSeq = testValues.map { case (x, y) => (new GcdInputBundle(16)).Lit(_.value1 -> x.U, _.value2 -> y.U) }
  //     val resultSeq = testValues.map { case (x, y) =>
  //       (new GcdOutputBundle(16)).Lit(_.value1 -> x.U, _.value2 -> y.U, _.gcd -> BigInt(x).gcd(BigInt(y)).U)
  //     }


  //     fork {
  //       // push inputs into the calculator, stall for 11 cycles one third of the way
  //       val (seq1, seq2) = inputSeq.splitAt(resultSeq.length / 3)
  //       dut.input.enqueueSeq(seq1)
  //       dut.clock.step(11)
  //       dut.input.enqueueSeq(seq2)
  //     }.fork {
  //       // retrieve computations from the calculator, stall for 10 cycles one half of the way
  //       val (seq1, seq2) = resultSeq.splitAt(resultSeq.length / 2)
  //       // printf("dut output:%d\n",dut.output.bits.value1)
  //       dut.output.expectDequeueSeq(seq1)
  //       dut.clock.step(10)
  //       dut.output.expectDequeueSeq(seq2)
  //     }.join()

  //   }
  // }
}
