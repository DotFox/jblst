/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.pegasys.teku.bls.impl.blst.swig;

public class fp2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected fp2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(fp2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        blstJNI.delete_fp2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFp(fp value) {
    blstJNI.fp2_fp_set(swigCPtr, this, fp.getCPtr(value), value);
  }

  public fp getFp() {
    long cPtr = blstJNI.fp2_fp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new fp(cPtr, false);
  }

  public fp2() {
    this(blstJNI.new_fp2(), true);
  }

}