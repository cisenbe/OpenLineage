/* SPDX-License-Identifier: Apache-2.0 */

package io.openlineage.spark3.agent.lifecycle.plan.catalog;

public class UnsupportedCatalogException extends RuntimeException {

  private static final long serialVersionUID = -7010410663426945378L;

  public UnsupportedCatalogException(String catalog) {
    super(catalog);
  }
}
