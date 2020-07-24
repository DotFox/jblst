/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.pegasys.teku.bls.impl.blst.swig;

public class blstJNI {
  public final static native int BLST_SUCCESS_get();
  public final static native void scalar_l_set(long jarg1, scalar jarg1_, long jarg2);
  public final static native long scalar_l_get(long jarg1, scalar jarg1_);
  public final static native long new_scalar();
  public final static native void delete_scalar(long jarg1);
  public final static native void fr_l_set(long jarg1, fr jarg1_, long jarg2);
  public final static native long fr_l_get(long jarg1, fr jarg1_);
  public final static native long new_fr();
  public final static native void delete_fr(long jarg1);
  public final static native void fp_l_set(long jarg1, fp jarg1_, long jarg2);
  public final static native long fp_l_get(long jarg1, fp jarg1_);
  public final static native long new_fp();
  public final static native void delete_fp(long jarg1);
  public final static native void fp2_fp_set(long jarg1, fp2 jarg1_, long jarg2, fp jarg2_);
  public final static native long fp2_fp_get(long jarg1, fp2 jarg1_);
  public final static native long new_fp2();
  public final static native void delete_fp2(long jarg1);
  public final static native void fp6_fp2_set(long jarg1, fp6 jarg1_, long jarg2, fp2 jarg2_);
  public final static native long fp6_fp2_get(long jarg1, fp6 jarg1_);
  public final static native long new_fp6();
  public final static native void delete_fp6(long jarg1);
  public final static native void fp12_fp6_set(long jarg1, fp12 jarg1_, long jarg2, fp6 jarg2_);
  public final static native long fp12_fp6_get(long jarg1, fp12 jarg1_);
  public final static native long new_fp12();
  public final static native void delete_fp12(long jarg1);
  public final static native void scalar_from_uint32(long jarg1, scalar jarg1_, long[] jarg2);
  public final static native void uint32_from_scalar(long[] jarg1, long jarg2, scalar jarg2_);
  public final static native void scalar_from_uint64(long jarg1, scalar jarg1_, long jarg2);
  public final static native void uint64_from_scalar(long jarg1, long jarg2, scalar jarg2_);
  public final static native void scalar_from_bendian(long jarg1, scalar jarg1_, byte[] jarg2);
  public final static native void bendian_from_scalar(byte[] jarg1, long jarg2, scalar jarg2_);
  public final static native void scalar_from_lendian(long jarg1, scalar jarg1_, byte[] jarg2);
  public final static native void lendian_from_scalar(byte[] jarg1, long jarg2, scalar jarg2_);
  public final static native int scalar_fr_check(long jarg1, scalar jarg1_);
  public final static native void p1_x_set(long jarg1, p1 jarg1_, long jarg2, fp jarg2_);
  public final static native long p1_x_get(long jarg1, p1 jarg1_);
  public final static native void p1_y_set(long jarg1, p1 jarg1_, long jarg2, fp jarg2_);
  public final static native long p1_y_get(long jarg1, p1 jarg1_);
  public final static native void p1_z_set(long jarg1, p1 jarg1_, long jarg2, fp jarg2_);
  public final static native long p1_z_get(long jarg1, p1 jarg1_);
  public final static native long new_p1();
  public final static native void delete_p1(long jarg1);
  public final static native void p1_affine_x_set(long jarg1, p1_affine jarg1_, long jarg2, fp jarg2_);
  public final static native long p1_affine_x_get(long jarg1, p1_affine jarg1_);
  public final static native void p1_affine_y_set(long jarg1, p1_affine jarg1_, long jarg2, fp jarg2_);
  public final static native long p1_affine_y_get(long jarg1, p1_affine jarg1_);
  public final static native long new_p1_affine();
  public final static native void delete_p1_affine(long jarg1);
  public final static native void p1_add(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_, long jarg3, p1 jarg3_);
  public final static native void p1_add_or_double(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_, long jarg3, p1 jarg3_);
  public final static native void p1_add_affine(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_, long jarg3, p1_affine jarg3_);
  public final static native void p1_add_or_double_affine(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_, long jarg3, p1_affine jarg3_);
  public final static native void p1_double(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_);
  public final static native void p1_mult_w5(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_, long jarg3, scalar jarg3_, long jarg4);
  public final static native void p1_cneg(long jarg1, p1 jarg1_, long jarg2);
  public final static native void p1_to_affine(long jarg1, p1_affine jarg1_, long jarg2, p1 jarg2_);
  public final static native void p1_from_affine(long jarg1, p1 jarg1_, long jarg2, p1_affine jarg2_);
  public final static native int p1_affine_on_curve(long jarg1, p1_affine jarg1_);
  public final static native int p1_affine_in_g1(long jarg1, p1_affine jarg1_);
  public final static native int p1_affine_is_equal(long jarg1, p1_affine jarg1_, long jarg2, p1_affine jarg2_);
  public final static native void p2_x_set(long jarg1, p2 jarg1_, long jarg2, fp2 jarg2_);
  public final static native long p2_x_get(long jarg1, p2 jarg1_);
  public final static native void p2_y_set(long jarg1, p2 jarg1_, long jarg2, fp2 jarg2_);
  public final static native long p2_y_get(long jarg1, p2 jarg1_);
  public final static native void p2_z_set(long jarg1, p2 jarg1_, long jarg2, fp2 jarg2_);
  public final static native long p2_z_get(long jarg1, p2 jarg1_);
  public final static native long new_p2();
  public final static native void delete_p2(long jarg1);
  public final static native void p2_affine_x_set(long jarg1, p2_affine jarg1_, long jarg2, fp2 jarg2_);
  public final static native long p2_affine_x_get(long jarg1, p2_affine jarg1_);
  public final static native void p2_affine_y_set(long jarg1, p2_affine jarg1_, long jarg2, fp2 jarg2_);
  public final static native long p2_affine_y_get(long jarg1, p2_affine jarg1_);
  public final static native long new_p2_affine();
  public final static native void delete_p2_affine(long jarg1);
  public final static native void p2_add(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_, long jarg3, p2 jarg3_);
  public final static native void p2_add_or_double(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_, long jarg3, p2 jarg3_);
  public final static native void p2_add_affine(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_, long jarg3, p2_affine jarg3_);
  public final static native void p2_add_or_double_affine(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_, long jarg3, p2_affine jarg3_);
  public final static native void p2_double(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_);
  public final static native void p2_mult_w5(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_, long jarg3, scalar jarg3_, long jarg4);
  public final static native void p2_cneg(long jarg1, p2 jarg1_, long jarg2);
  public final static native void p2_to_affine(long jarg1, p2_affine jarg1_, long jarg2, p2 jarg2_);
  public final static native void p2_from_affine(long jarg1, p2 jarg1_, long jarg2, p2_affine jarg2_);
  public final static native int p2_affine_on_curve(long jarg1, p2_affine jarg1_);
  public final static native int p2_affine_in_g2(long jarg1, p2_affine jarg1_);
  public final static native int p2_affine_is_equal(long jarg1, p2_affine jarg1_, long jarg2, p2_affine jarg2_);
  public final static native void encode_to_g1(long jarg1, p1 jarg1_, byte[] jarg2, byte[] jarg4, byte[] jarg6);
  public final static native void hash_to_g1(long jarg1, p1 jarg1_, byte[] jarg2, byte[] jarg4, byte[] jarg6);
  public final static native void encode_to_g2(long jarg1, p2 jarg1_, byte[] jarg2, byte[] jarg4, byte[] jarg6);
  public final static native void hash_to_g2(long jarg1, p2 jarg1_, byte[] jarg2, byte[] jarg4, byte[] jarg6);
  public final static native void p1_serialize(byte[] jarg1, long jarg2, p1 jarg2_);
  public final static native void p1_compress(byte[] jarg1, long jarg2, p1 jarg2_);
  public final static native void p1_affine_serialize(byte[] jarg1, long jarg2, p1_affine jarg2_);
  public final static native void p1_affine_compress(byte[] jarg1, long jarg2, p1_affine jarg2_);
  public final static native int p1_uncompress(long jarg1, p1_affine jarg1_, byte[] jarg2);
  public final static native int p1_deserialize(long jarg1, p1_affine jarg1_, byte[] jarg2);
  public final static native void p2_serialize(byte[] jarg1, long jarg2, p2 jarg2_);
  public final static native void p2_compress(byte[] jarg1, long jarg2, p2 jarg2_);
  public final static native void p2_affine_serialize(byte[] jarg1, long jarg2, p2_affine jarg2_);
  public final static native void p2_affine_compress(byte[] jarg1, long jarg2, p2_affine jarg2_);
  public final static native int p2_uncompress(long jarg1, p2_affine jarg1_, byte[] jarg2);
  public final static native int p2_deserialize(long jarg1, p2_affine jarg1_, byte[] jarg2);
  public final static native void keygen(long jarg1, scalar jarg1_, byte[] jarg2, byte[] jarg4);
  public final static native void sk_to_pk_in_g1(long jarg1, p1 jarg1_, long jarg2, scalar jarg2_);
  public final static native void sign_pk_in_g1(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_, long jarg3, scalar jarg3_);
  public final static native void sk_to_pk_in_g2(long jarg1, p2 jarg1_, long jarg2, scalar jarg2_);
  public final static native void sign_pk_in_g2(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_, long jarg3, scalar jarg3_);
  public final static native long new_pairing();
  public final static native void delete_pairing(long jarg1);
  public final static native long pairing_sizeof();
  public final static native void pairing_init(long jarg1, pairing jarg1_);
  public final static native void pairing_commit(long jarg1, pairing jarg1_);
  public final static native int pairing_aggregate_pk_in_g2(long jarg1, pairing jarg1_, long jarg2, p2_affine jarg2_, long jarg3, p1_affine jarg3_, int jarg4, byte[] jarg5, byte[] jarg7, byte[] jarg9);
  public final static native int pairing_mul_n_aggregate_pk_in_g2(long jarg1, pairing jarg1_, long jarg2, p2_affine jarg2_, long jarg3, p1_affine jarg3_, long jarg4, p1_affine jarg4_, java.math.BigInteger jarg5, long jarg6);
  public final static native int pairing_aggregate_pk_in_g1(long jarg1, pairing jarg1_, long jarg2, p1_affine jarg2_, long jarg3, p2_affine jarg3_, int jarg4, byte[] jarg5, byte[] jarg7, byte[] jarg9);
  public final static native int pairing_mul_n_aggregate_pk_in_g1(long jarg1, pairing jarg1_, long jarg2, p1_affine jarg2_, long jarg3, p2_affine jarg3_, long jarg4, p2_affine jarg4_, java.math.BigInteger jarg5, long jarg6);
  public final static native int pairing_merge(long jarg1, pairing jarg1_, long jarg2, pairing jarg2_);
  public final static native int pairing_finalverify(long jarg1, pairing jarg1_, long jarg2, fp12 jarg2_);
  public final static native int aggregate_in_g1(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_, long jarg3);
  public final static native int aggregate_in_g2(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_, long jarg3);
  public final static native void aggregated_in_g1(long jarg1, fp12 jarg1_, long jarg2, p1_affine jarg2_);
  public final static native void aggregated_in_g2(long jarg1, fp12 jarg1_, long jarg2, p2_affine jarg2_);
  public final static native int core_verify_pk_in_g1(long jarg1, p1_affine jarg1_, long jarg2, p2_affine jarg2_, int jarg3, byte[] jarg4, byte[] jarg6, byte[] jarg8);
  public final static native int core_verify_pk_in_g2(long jarg1, p2_affine jarg1_, long jarg2, p1_affine jarg2_, int jarg3, byte[] jarg4, byte[] jarg6, byte[] jarg8);
  public final static native void BLS12_381_G1_set(long jarg1, p1_affine jarg1_);
  public final static native long BLS12_381_G1_get();
  public final static native void BLS12_381_NEG_G1_set(long jarg1, p1_affine jarg1_);
  public final static native long BLS12_381_NEG_G1_get();
  public final static native void BLS12_381_G2_set(long jarg1, p2_affine jarg1_);
  public final static native long BLS12_381_G2_get();
  public final static native void BLS12_381_NEG_G2_set(long jarg1, p2_affine jarg1_);
  public final static native long BLS12_381_NEG_G2_get();
  public final static native int p1_on_curve(long jarg1, p1 jarg1_);
  public final static native int p2_on_curve(long jarg1, p2 jarg1_);
  public final static native void p1_from_jacobian(long jarg1, p1 jarg1_, long jarg2, p1 jarg2_);
  public final static native void p2_from_jacobian(long jarg1, p2 jarg1_, long jarg2, p2 jarg2_);
  public final static native void sk_to_pk2_in_g1(byte[] jarg1, long jarg2, p1_affine jarg2_, long jarg3, scalar jarg3_);
  public final static native void sign_pk2_in_g1(byte[] jarg1, long jarg2, p2_affine jarg2_, long jarg3, p2 jarg3_, long jarg4, scalar jarg4_);
  public final static native void sk_to_pk2_in_g2(byte[] jarg1, long jarg2, p2_affine jarg2_, long jarg3, scalar jarg3_);
  public final static native void sign_pk2_in_g2(byte[] jarg1, long jarg2, p1_affine jarg2_, long jarg3, p1 jarg3_, long jarg4, scalar jarg4_);
  public final static native byte[] cdata(long jarg1, int jarg2);
  public final static native void memmove(long jarg1, byte[] jarg2);
}
