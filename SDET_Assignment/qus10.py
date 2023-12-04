import time
import pytest
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

@pytest.fixture
def browser():
    driver = webdriver.Chrome(executable_path="path/to/chromedriver")
    yield driver
    driver.quit()

def test_automation_anywhere(browser):
    # Navigate to the website
    browser.get("https://www.automationanywhere.com/")

    # Mouse over on Products
    products_menu = browser.find_element(By.XPATH, "//a[text()='Products']")
    ActionChains(browser).move_to_element(products_menu).perform()

    # Click on Process Discovery
    process_discovery_link = browser.find_element(By.XPATH, "//a[text()='Process Discovery']")
    process_discovery_link.click()

    # Wait for the page to load
    WebDriverWait(browser, 10).until(EC.url_to_be("https://www.automationanywhere.com/products/process-discovery"))

    # Verify the URL
    assert browser.current_url == "https://www.automationanywhere.com/products/process-discovery", "URL mismatch"

if __name__ == "__main__":
    pytest.main([__file__])
